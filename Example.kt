import java.io.File

fun main() {
    // 1. 打印当前工作目录
    val workingDir = System.getProperty("user.dir")
    println("当前工作目录: $workingDir")

    // 2. 准备输出文件
    val outputFile = File("./out.txt")
    println("输出文件路径: ${outputFile.absolutePath}")

    // 确保文件可写（若不存在则创建）
    if (!outputFile.exists()) {
        outputFile.createNewFile()
        println("已创建新文件: ${outputFile.name}")
    }

    // 重复执行10次
    repeat(10) { i ->
        val timestamp = System.currentTimeMillis()
        val count = i + 1
        val message = "$count: $timestamp"

        // 打印到控制台
        println(message)

        // 写入文件（追加模式）
        outputFile.appendText("$message\n")

        // 暂停1秒
        Thread.sleep(1_000)
    }

    println("任务完成！结果已写入 ${outputFile.name}")
}