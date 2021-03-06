package ru.spbstu.icc.kspt.storage

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import ru.spbstu.icc.kspt.common.PermissionManager
import ru.spbstu.icc.kspt.common.alert
import ru.spbstu.icc.kspt.common.getExtra
import ru.spbstu.icc.kspt.common.toast

abstract class StorageActivity : AppCompatActivity() {

    private val permissionManager = PermissionManager()

    val accessType by lazy {
        getExtra<AccessType>(ACCESS_TYPE)
    }

    fun withPermissions(callback: () -> Unit) {
        val permission = when (accessType) {
            AccessType.READ -> Manifest.permission.READ_EXTERNAL_STORAGE
            AccessType.WRITE -> Manifest.permission.WRITE_EXTERNAL_STORAGE
        }
        permissionManager.withPermissions(this, permission) { permissionGranted ->
            if (permissionGranted) {
                callback()
            } else {
                toast("permissions denied")
                alert(getString(R.string.permissionDenied))
            }
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        permissionManager.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    enum class AccessType { READ, WRITE }

    companion object {
        const val ACCESS_TYPE = "ru.spbstu.icc.kspt.storage.ManualExternalStorageActivity.ACCESS_TYPE"
    }
}