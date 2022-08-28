package IS.issueService.web

import IS.issueService.config.AuthUser
import IS.issueService.domain.enums.IssueStatus
import IS.issueService.model.IssueRequest
import IS.issueService.service.IssueService
import org.springframework.web.bind.annotation.*


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

    @GetMapping
    fun getAll(
        authUser : AuthUser,
        @RequestParam(required = false, defaultValue = "TODO") status : IssueStatus,

        ) = issueService.getAll(status)
}