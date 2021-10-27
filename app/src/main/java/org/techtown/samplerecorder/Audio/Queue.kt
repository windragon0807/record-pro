package org.techtown.samplerecorder.Audio

import java.util.*
import java.util.Queue

class Queue {
    private val TAG = this.javaClass.simpleName

    var queue: Queue<ByteArray>? = null
    var store: Queue<ByteArray>

    fun enqueue(data: ByteArray) {
        queue!!.offer(data)
        store.offer(data)
    }

    fun dequeue(): ByteArray {
        return queue!!.poll()
    }

    fun copy() {
        queue!!.addAll(store)
    }

    val isEmpty: Boolean
        get() = queue!!.isEmpty()

    init {
        queue = LinkedList()
        store = LinkedList()
    }
}