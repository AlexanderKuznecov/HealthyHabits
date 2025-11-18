package com.example.healthyhabits

import com.example.healthyhabits.model.Habit
import com.example.healthyhabits.utils.calculateCompletionPercentage
import org.junit.Assert.assertEquals
import org.junit.Test

class HabitStatsTest {

    @Test
    fun `when no habits then percentage is 0`() {
        val habits = emptyList<Habit>()

        val result = calculateCompletionPercentage(habits)

        assertEquals(0, result)
    }

    @Test
    fun `when half of habits are completed then percentage is 50`() {
        val habits = listOf(
            Habit(id = 1, name = "Habit 1", isCompleted = true),
            Habit(id = 2, name = "Habit 2", isCompleted = false)
        )

        val result = calculateCompletionPercentage(habits)

        assertEquals(50, result)
    }

    @Test
    fun `when all habits are completed then percentage is 100`() {
        val habits = listOf(
            Habit(id = 1, name = "Habit 1", isCompleted = true),
            Habit(id = 2, name = "Habit 2", isCompleted = true),
            Habit(id = 3, name = "Habit 3", isCompleted = true)
        )

        val result = calculateCompletionPercentage(habits)

        assertEquals(100, result)
    }
}
