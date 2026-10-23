package org.example.lessons.lesson13.homeworks

fun main() {
    // 1. Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее
    // время выполнения теста.
    val testTimes = mapOf(
        "loginTest" to 1.2,
        "paymentTest" to 3.4,
        "searchTest" to 0.8
    )
    val averageTime = testTimes.values.average()
    val resultaverageTime = String.format("%.2f", averageTime)
    println("1. Среднее время: $resultaverageTime")

    // 2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов, а значения -
    // строка с метаданными. Выведите список всех тестовых методов.
    val testMetadata = mapOf(
        "testLogin" to "owner=qa; priority=high",
        "testPayment" to "owner=qa; priority=critical",
        "testSearch" to "owner=auto; priority=medium"
    )
    val testMethods = testMetadata.keys.toList()
    println("2. Список всех тестовых методов: $testMethods")

   // 3. В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val mutableTestResults = mutableMapOf(
        "login" to "passed",
        "payment" to "failed"
    )
    mutableTestResults.put("newTest", "passed")
    println("3. Словарь после добавления нового результата теста: $mutableTestResults")

    // 4. Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из
    // passed, failed, skipped).
    val results = mapOf(
        "login" to "passed",
        "payment" to "failed",
        "search" to "passed",
        "profile" to "skipped"
    )
    val passedCount = results.values.count { it == "passed" }
    println("4. Количество пройденных тестов: $passedCount")

    // 5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение
    // - статус исправления).
    val mutableBugTracker = mutableMapOf(
        "BUG-1" to true,
        "BUG-2" to false,
        "BUG-3" to false
    )
    mutableBugTracker.values.removeAll { it == true }
    println("5. Словарь после удаления исправленного бага: $mutableBugTracker")

    // 6. Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите
    //сообщение о странице и статусе её проверки.
    val webResults = mapOf(
        "https://example.com" to 200,
        "https://example.com/login" to 500,
        "https://example.com/cart" to 404
    )
    println("6:")
    webResults.forEach { (url, status) ->
    println("  Страница $url: статус проверки — $status")
    }

    // 7. Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный
    // порог.
    val serviceTimes = mapOf(
        "auth" to 120,
        "payments" to 850,
        "search" to 300
    )
    val threshold = 500
    val slowServices = serviceTimes.filterValues { it > threshold }

    // 8. В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки). Для
    // указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val apiResults = mapOf(
        "/users" to "200 OK",
        "/orders" to "500 Internal Server Error"
    )
    val endpoint = "/missing"
    val endpointStatus = apiResults.getOrElse(endpoint) { "не был протестирован" }

    // 9. Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение -
    // сама конфигурация), получите значение для "browserType". Ответ не может быть null.
    val envConfig = mapOf(
        "browserType" to "chrome",
        "headless" to "true",
        "timeout" to "30"
    )
    val browserType = envConfig.getValue("browserType")

    // 10. Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val versions = mapOf(
        "1.0.0" to "stable",
        "1.1.0" to "beta"
    )
    val updatedVersions = versions + ("2.0.0" to "stable")
    println("10. Добавление в неизменяемый словарь")

    // 11. Настройки для модели устройства или настройки по умолчанию
    val mobileSettings = mapOf(
        "iPhone 15" to "iOS 17",
        "Pixel 8" to "Android 14"
    )
    val deviceModel = "Xiaomi 14"
    val defaultSettings = "default: Android"
    val deviceSettings = mobileSettings.getOrDefault(deviceModel, defaultSettings)

    // 12. Содержит ли словарь ошибок заданный код ошибки
    val errorDict = mapOf(
        404 to "Not Found",
        500 to "Internal Server Error"
    )
    val errorCode = 500
    val hasErrorCode = errorDict.containsKey(errorCode)

    // 13. Оставить сценарии только для требуемой версии
    val testStatuses = mapOf(
        "TC-101_v1.0" to "Passed",
        "TC-102_v1.0" to "Failed",
        "TC-201_v2.0" to "Passed"
    )
    val version = "v1.0"
    val versionTests = testStatuses.filterKeys { it.endsWith("_$version") }

    // 14. Есть ли модули с неудачным тестированием
    val moduleResults = mapOf(
        "auth" to "passed",
        "cart" to "failed",
        "search" to "passed"
    )
    val hasFailedModule = moduleResults.values.any { it == "failed" }

    // 15. Добавить настройки из другого словаря в изменяемый словарь
    val mutableEnvSettings = mutableMapOf(
        "browser" to "chrome",
        "timeout" to "30"
    )
    val extraSettings = mapOf(
        "retries" to "2",
        "headless" to "true"
    )
    mutableEnvSettings.putAll(extraSettings)

   // 16. Объединить два неизменяемых словаря с багами
    val bugs1 = mapOf(
        "BUG-1" to "open",
        "BUG-2" to "closed"
    )
    val bugs2 = mapOf(
        "BUG-3" to "open",
        "BUG-4" to "in progress"
    )
    val mergedBugs = bugs1 + bugs2

    // 17. Очистить изменяемый словарь временных данных
    val mutableRunData = mutableMapOf(
        "lastRun" to "2026-10-19",
        "duration" to "120s"
    )
    mutableRunData.clear()

    // 18. Исключить пропущенные тесты
    val report = mapOf(
        "login" to "passed",
        "payment" to "skipped",
        "search" to "passed"
    )
    val reportWithoutSkipped = report.filterValues { it != "skipped" }

    // 19. Копия словаря конфигураций без нескольких ключей
    val configs = mapOf(
        "dbUrl" to "jdbc:postgresql://localhost/test",
        "apiToken" to "secret",
        "browser" to "chrome",
        "timeout" to "30"
    )
    val reducedConfigs = configs - listOf("dbUrl", "apiToken")

   // 20. Отчёт в виде списка строк
    val reportLines = results.map { (id, result) ->
        "Test ID: $id, результат: $result"
    }

    // 21. Преобразовать изменяемый словарь в неизменяемый
    val resultsForReport = mapOf(
        "T1" to "passed",
        "T2" to "failed",
        "T3" to "skipped"
    )
    val mutableResults = mutableMapOf(
        "T1" to "passed",
        "T2" to "failed"
    )
    val archivedResults: Map<String, String> = mutableResults.toMap()

    // 22. Заменить числовые ID тестов на строковые
    val idTimes = mapOf(
        101 to 1.5,
        102 to 2.0,
        103 to 0.7
    )
    val stringIdTimes = idTimes.mapKeys { it.key.toString() }

   // 23. Увеличить оценки производительности на 10%
    val perf = mapOf(
        "1.0.0" to 120.0,
        "1.1.0" to 95.5
    )
    val increasedPerf = perf.mapValues { it.value * 1.10 }

   // 24. Пуст ли словарь ошибок компиляции
    val compileErrors = emptyMap<String, String>()
    val noCompileErrors = compileErrors.isEmpty()

   // 25. Не пуст ли словарь результатов нагрузочного тестирования
    val loadResults = mapOf(
        "rampUp" to "ok",
        "steady" to "ok"
    )
    val hasLoadResults = loadResults.isNotEmpty()

   // 26. Все ли автоматизированные тесты прошли успешно
    val allPassed = results.all { it.value == "passed" }

   // 27. Есть ли хотя бы один тест с ошибкой
    val hasFailedTest = results.any { it.value == "failed" }

   // 28. Оставить неуспешные тесты, в названии которых есть "optional"
    val serviceResults = mapOf(
        "loginOptional" to "failed",
        "payment" to "failed",
        "searchOptional" to "passed",
        "profileOptional" to "skipped"
    )
    val optionalFailed = serviceResults.filter { (name, status) ->
        status != "passed" && name.contains("optional")
    }
}