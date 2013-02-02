import play.api.mvc.{Action, Controller}

#if ((${PACKAGE_NAME} && ${PACKAGE_NAME} != ""))package ${PACKAGE_NAME} #end
#parse("File Header.java")
object ${NAME} extends Controller {
}
