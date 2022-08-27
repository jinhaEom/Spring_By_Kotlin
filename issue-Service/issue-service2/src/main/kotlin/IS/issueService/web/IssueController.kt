package IS.issueService.web

import IS.issueService.config.AuthUser
import IS.issueService.model.IssueRequest
import IS.issueService.service.IssueService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1/issues")
class IssueController(
    private val issueService : IssueService
) {

    @PostMapping
    fun create(
        authUser: AuthUser,
        @RequestBody request : IssueRequest,
    ) = issueService.create(authUser.userId ,request)
}