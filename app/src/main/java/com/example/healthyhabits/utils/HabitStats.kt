package com.example.healthyhabits.utils

import com.example.healthyhabits.model.Habit

/**
 * Връща процент завършени навици (0–100).
 *
 * Ако списъкът е празен, връща 0.
 */
fun calculateCompletionPercentage(habits: List<Habit>): Int {
    if (habits.isEmpty()) return 0

    val completedCount = habits.count { it.isCompleted }
    // умножаваме по 100 преди делението, за да избегнем загуба на точност
    val percent = (completedCount * 100.0) / habits.size.toDouble()

    return percent.toInt() // връщаме цяло число (примерно 33, 50, 100)
}
