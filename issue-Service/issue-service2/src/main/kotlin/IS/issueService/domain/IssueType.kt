package IS.issueService.domain

enum class IssueType {
    //이슈 종류를 나타냄

    BUG, TASK;

    companion object {
       operator fun invoke(type : String) = valueOf(type.uppercase())
    }
}

