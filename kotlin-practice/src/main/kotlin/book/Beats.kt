package book

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.File
import javax.sound.sampled.AudioSystem

fun main() {
    val coroutine = CoroutineScope(Dispatchers.IO)

    coroutine.launch {
        playBeats("x-x-x-x-x-x-x-", "audio/toms.aiff")
        playBeats("x------x------", "audio/crash_cymbal.aiff")
    }

    Thread.sleep(100_000)
}

suspend fun playBeats(beats: String, file: String) {
    val parts = beats.split("x")
    var count = 0

    for (part in parts) {
        count += part.length + 1
        if (part == "") {
            playSound(file)
        } else {
            kotlinx.coroutines.delay(100 * (part.length + 1L))
            if (count < beats.length) {
                playSound(file)
            }
        }
    }
}

fun playSound(file: String) {
    val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream(
        File(file)
    )
    clip.open(audioInputStream)
    clip.start()
}
