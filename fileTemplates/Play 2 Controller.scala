#if ((${PACKAGE_NAME} && ${PACKAGE_NAME} != ""))package ${PACKAGE_NAME} #end

import play.api.mvc.{Action, Controller}

#parse("File Header.java")
object ${NAME} extends Controller {
}
