package IS.issueService.domain

import javax.persistence.*


@Entity
@Table

class Issue (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? = null,

    @Column
    var userId : Long,

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