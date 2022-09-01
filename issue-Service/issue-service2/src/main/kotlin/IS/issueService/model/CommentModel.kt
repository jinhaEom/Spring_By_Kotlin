package IS.issueService.model

import IS.issueService.domain.Comment

data class CommentRequest(
    val body : String,

)
data class CommentResponse(
    val id : Long,
    val issueId : Long,
    val userId : Long,
    val body : String,
    val username : String?= null

)

fun Comment.toResponse() = CommentResponse( // 확장함수
    id = id!!,
    issueId = issue.id!!,
    userId = userId,
    body = body,
    username = username,
)