package IS.issueService.Exception

sealed class ServerException(
    val code : Int,
    override val message : String,
) : RuntimeException(message)

data class NotFoundException(
    override val message : String,
) : ServerException(404, message) // 커스텀한 코드의 404임




// 인증정보가 잘못되었을때 발생가능한 exception
data class UnauthorizedException(
    override val message : String= "인증 정보가 잘못 되었습니다.",

    ): ServerException(401, message)