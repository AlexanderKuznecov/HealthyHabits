package com.example.healthyhabits.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.healthyhabits.model.Habit

class HomeViewModel : ViewModel() {

    // Списък с навици – засега примерни (по-късно ще ги зареждаме от база)
    var habits by mutableStateOf(
        listOf(
            Habit(id = 1, name = "Пиене на вода", description = "8 чаши на ден"),
            Habit(id = 2, name = "Разходка", description = "30 минути навън"),
            Habit(id = 3, name = "Четене", description = "15 минути книга")
        )
    )
        private set

    // Ще ни трябва по-нататък, когато AddHabitScreen започне да записва
    fun addHabit(name: String, description: String?) {
        val newId = (habits.maxOfOrNull { it.id } ?: 0L) + 1L

        val newHabit = Habit(
            id = newId,
            name = name,
            description = description
        )

        habits = habits + newHabit
    }
}
