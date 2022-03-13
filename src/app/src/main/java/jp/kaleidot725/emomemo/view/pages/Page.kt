package jp.kaleidot725.emomemo.view.pages

import androidx.navigation.NavBackStackEntry

sealed class Page(val route: String) {
    object Main : Page(route = "main")
    object AddNoteBook : Page(route = "main/add")
    object RemoveNotebook : Page(route = "main/remove")
    object Memo : Page(route = "memo/{memoId}") {
        fun createRoute(memoId: Int) = "memo/$memoId"
        fun getArgumentId(entry: NavBackStackEntry): Int {
            return entry.arguments?.getString("memoId")?.toInt() ?: 0
        }
    }
}