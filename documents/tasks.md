
# Задачи

1. `[done]` Разработать структуру проекта
1. `[done]` Создать `gradle` проект с заданной структурой
1. `[done]` Реализовать минимальную функциональность
1. `[done]` Перевести проект на `android` платформу
1. `[done]` Разработать модуль доступа к `external storage`
	1. `[done]` Разработать `UI'` для выбора автоматически найденных файлов
	1. `[done]` Разработать `UI'` для ручного задания пути к файлу
	1. `[done]` Получать права на чтение файла и запись в него, внутри данного модуля
1. Разработать модуль работы со звуком
	1. Разработать `UI'` для выбора способа получения звука (поиск звукового файла в файловой системе, запись звукового файла при помощи микрофона)
	1. Разработать `UI'` для записи звукового файла
	1. Реализовать сохранение записанного звукового файла в [adnroid cache](https://developer.android.com/guide/topics/data/data-storage#InternalCache)
	1. `[hard]` Реализовать шумоподавление во время записи звукового файла
1. Разработка конфигурирования правил создания сценариев
	1. Разработка конфигурационного файла
		1. Придумать локаничное уникальное расширение для конфигруационного файла
		1. Выбрать способ сжатия данных директории с конфигруациями в один файл
		1. Разработать структуру `json` файла для сохранения конфигураций правил создания сценариев игры
	1. Разработать переменные для задания правил создания сценариев
		1. Разработать `UI'` для задания переменных (должны быть не отличимы от обычных настроек игры)
		1. Реализовать переменные для задания времени действия и его типа (завершение по времени, по нажатию кнопку завершения)
		1. Реализовать переменные для задания сложности игры
		1. Реализовать переменные для задания типа озвучки (женский голос, мужской голос, инопланетянин и тп.)
		1. Реализовать переменные для задания языка
		1. ...
	1. Разработать `UI'` для конфигурирования профиля персонажа (иконка, имя, описание)
		1. Реализовать `UI'` для использования переменных
	1. Разработать `UI'` для конфигурирования профиля действия (озвучка, текст, время, персонажи, цвет, тип)
		1. Реализовать `UI'` для использования переменных
	1. Разработать `UI'` для конфигурирования правил создания сценариев
		1. Реализовать безусловное задание сценария игры
		1. Реализовать группирование сценариев в именованные группы
		1. Реализовать задание сценария игры зависимое от персонажей в игре
			<br/> Должна быть возможность воспроизведения действия или их группы в случае присутствия того или иного персонажа в игре
			* Например в если в игре есть персонаж который копирует чужую роль, то должны появится несколько новых действий
			* Например если в игре есть три *злодея* то рассказчик должен сказать, что открывают глаза все злодеи кроме главного иначе должен сказать, что открывают глаза все злодеи
			* Например если есть роль падаван но нет роли мастер, то падаван пытается постичь светлые силы, а если есть учитель и падаван одновременно, то падаван пытается убить мастера, используя тёмные силы
		1. Реализовать задание сценария игры зависимое от значения переменных правил создания сценариев
			<br/> Например для задания действий лёгкой или сложной игры
		1. Разработать `UI'` для задания правил сетапа игры
			1. Реализовать задание зависимости набора персонажей от количества людей
			1. Реализовать задание зависимости значений переменных от количества людей
				Например для задания времени отведённого на тот или иной раунд
		1. Разработать проверку сетапа игры 
			* Например для проверки того что в игре есть соперники, не нулевое количество злодеев и добряков
			* Например для проверки того что есть роль, которая работает в паре с другой ролью
1. Разработка основного конвейера игры
	1. Разработать `UI'` для выбора правил игры
	1. Разработать `UI'` для выбора сетапа игры
		1. Вручную, нажимая на иконки персонажей
		1. Автоматически опираясь на заданные правила сетапа игры
	1. Разработать `UI'` для отображения действий игры
	1. Разработать логику запуска игры
		* Запуск проверки сетапа игры
		* Запуск первого действия игры
		* Запуск следующего действия игры после завершения предыдущего
1. Непрерывная интеграция
	1. `[done]` Прикрутить `travis ci` к проекту
	1. Тестирование логики приложения
	1. Тестирование `UI'` приложения
	1. `[hard]` Тестирование соблюдения контракта использования внутренних модулей
		<br/> У некоторых модулей есть завершение операций по `callback`, которые реализованы на основе `onActivityResult`, `onRequestPermissionsResult` и тп. Для правильной работы модулей следует вызвать соответствующие обработчики. Задача заключается в том, чтобы проверить вызываются обработчик внутри `activity` в случае, если была вызвана функция имеющая `callback` в этом `activity`. (Для примера смотри использование [CallManager](https://github.com/DeveloperHacker/konarrayka/blob/master/common/src/main/java/ru/spbstu/icc/kspt/common/CallManager.kt))
	1. Создать `issue` на `github` для всех ошибок найденных во время тестирования
1. `[incredibly]`Разработать `UI` с единым `material` дизайном
	1. Разработать концепты для всех `activity`, которые есть в приложении
	1. Реализовать концепты в приложении, максимально используя задание структуры `UI` при помощи `xml` разметки
1. Ошибки
	1. `[done]` Зависание `UI'` во время поиска файлов на телефоне
	1. Потеря состояние приложения во время поворота телефона
	1. ...
1. Распространение правил создания сценариев игры
	1. Реализовать `UI'` для отображения положения файла правил игры
		<br/> Нужно иметь возможность показывать путь к файлу с правлами игры, которые были подгружены в игру
	1. Реализовать `UI'` для передачи файла правил игры через `Bluetooth` соединение
	1. Реализовать `UI'` для передачи файла правил игры внутри локальной сети, в которой находится устройство
	
`*` `UI'` -- упрощённый `UI` и требуемая функциональность

`**` `UI` -- конечный `UI` для демонстрации людям