package IS.issueService.web

import IS.issueService.config.AuthUser
import IS.issueService.model.CommentRequest
import IS.issueService.model.CommentResponse
import IS.issueService.service.CommentService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/v1/issues/{issueId}/comments")
class CommentController(
    private val commentService: CommentService,
) {

    @PostMapping
    fun create(
        authUser: AuthUser,
        @PathVariable issueId: Long,
        @RequestBody request: CommentRequest,
    ): CommentResponse {
        return commentService.create(issueId, authUser.userId, authUser.username, request)
    }
}