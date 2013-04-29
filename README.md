play2ideatemplates
==================

Play Framework 2 IDEA live templates and file templates

## Installation Instructions

Follow these instructions to install the file(s) in templates: http://www.jetbrains.com/idea/webhelp/live-templates.html

Put the file(s) in fileTemplates in the fileTemplates directory located in the same directory where you've found the templates directory from the previous step.

IntelliJ syncs its in-memory fileTemplates to disk when it quits, and you need to re-launch IntelliJ for the new fileTemplates to become available. Thus, you must quit IntelliJ first, then copy (or symlink) the fileTemplate(s) to the correct directory, and only then re-launch IntelliJ. If you put the file in place, and then quit and re-launch IntelliJ, the new file will be deleted.

Cheers!

## Live templates

Here are the templates and what they expand to

* act (Action)

        def $ACTION_NAME$ = Action {
			implicit request => {
				$END$
			}
		}

* ok, 200 (Ok)

		Ok()

* 500 (Internal server error)

		InternalServerError()

* 404 (Not found)

		NotFound()

* 403 (Forbidden)

		Forbidden()

* tact (TODO Action)

		def $ACTION_NAME$ = TODO
