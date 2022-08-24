package IS.issueService.config

import org.springframework.context.annotation.Configuration
import org.springframework.core.MethodParameter
import org.springframework.stereotype.Component
import org.springframework.web.bind.support.WebDataBinderFactory
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.web.method.support.HandlerMethodArgumentResolver
import org.springframework.web.method.support.ModelAndViewContainer
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport


@Configuration
class WebConfig(
    private val authUserHandlerArgumentResolver : AuthUserHandlerArgumentResolver,

    ) : WebMvcConfigurationSupport(
) {
    override fun addArgumentResolvers(argumentResolvers: MutableList<HandlerMethodArgumentResolver>) {
        argumentResolvers.apply{
            add(authUserHandlerArgumentResolver)
        }
    }
}

@Component
class AuthUserHandlerArgumentResolver : HandlerMethodArgumentResolver {

    override fun supportsParameter(parameter: MethodParameter): Boolean =
        AuthUser::class.java.isAssignableFrom(parameter.parameterType)
        //parameter 타입과 AuthUser 가 동일하다면 Boolean 값 true


        override fun resolveArgument(
            parameter: MethodParameter,
            mavContainer: ModelAndViewContainer?,
            webRequest: NativeWebRequest,
            binderFactory: WebDataBinderFactory?
        ): Any? {

            return AuthUser(
                userId = 1,
                username = "test",
                //더미 데이터 (인증서버 구현이 아직 안되어있기 때문에 임시로 넣어줌)
            )
        }

        //supportsParameter 조건이 맞으면, resolveArgument 를 통해 객체에 대해 값을 셋팅 or 저장하는 기능 제공
    }

data class AuthUser(
    val userId : Long,
    val username : String,
    val profileUrl : String? = null
)