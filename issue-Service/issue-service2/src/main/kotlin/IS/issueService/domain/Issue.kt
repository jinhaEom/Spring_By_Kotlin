package IS.issueService.domain

import IS.issueService.domain.enums.IssuePriority
import IS.issueService.domain.enums.IssueStatus
import IS.issueService.domain.enums.IssueType
import javax.persistence.*
import javax.xml.stream.events.Comment


@Entity
@Table

class Issue (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? = null,

    @Column
    var userId : Long,

    @OneToMany(fetch = FetchType.EAGER)
    val comments : MutableList<Comment> = mutableListOf(),


    @Column
    var summary : String,

    @Column
    var description : String,

    @Column
    @Enumerated(EnumType.STRING)
    var type : IssueType,

    @Column
    @Enumerated(EnumType.STRING) // 중요도
    var priority : IssuePriority,

    @Column
    @Enumerated(EnumType.STRING)//이슈 상태
    var status : IssueStatus,


    ) : BaseEntity()