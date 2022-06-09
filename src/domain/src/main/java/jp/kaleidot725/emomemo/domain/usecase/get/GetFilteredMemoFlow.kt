package jp.kaleidot725.emomemo.domain.usecase.get

import jp.kaleidot725.emomemo.data.entity.MemoEntity
import jp.kaleidot725.emomemo.data.repository.MemoRepository
import kotlinx.coroutines.flow.Flow

class GetFilteredMemoFlow(private val memoRepository: MemoRepository) {
    fun execute(memoId: Long): Flow<List<MemoEntity>> {
        return memoRepository.getMemosFlowByMemoId(memoId)
    }
}
