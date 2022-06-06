package jp.kaleidot725.emomemo.view.pages

import androidx.navigation.NavBackStackEntry

sealed class Destination(val route: String) {
    object Main : Destination(route = "main")
    object NotebookBottom : Destination(route = "main/bottom")
    object AddNoteBook : Destination(route = "main/add/notebook")
    object DeleteNotebook : Destination(route = "main/remove/{notebookId}") {
        fun createRoute(notebookId: Long) = "main/remove/$notebookId"
        fun getArgumentId(entry: NavBackStackEntry): Long {
            return entry.arguments?.getString("notebookId")?.toLong() ?: 0L
        }
    }

    object AddMemo : Destination(route = "main/add/memo/{memoId}") {
        fun createRoute(memoId: Long) = "main/add/memo/$memoId"
        fun getArgumentId(entry: NavBackStackEntry): Long {
            return entry.arguments?.getString("memoId")?.toLong() ?: 0L
        }
    }

    object MemoBottom : Destination(route = "memo/bottom")

    object Memo : Destination(route = "memo/{memoId}") {
        fun createRoute(memoId: Long) = "memo/$memoId"
        fun getArgumentId(entry: NavBackStackEntry): Long {
            return entry.arguments?.getString("memoId")?.toLong() ?: 0L
        }
    }

    object DeleteMemo : Destination(route = "memo/delete/{memoId}") {
        fun createRoute(memoId: Long) = "memo/delete/$memoId"
        fun getArgumentId(entry: NavBackStackEntry): Long {
            return entry.arguments?.getString("memoId")?.toLong() ?: 0L
        }
    }
}
