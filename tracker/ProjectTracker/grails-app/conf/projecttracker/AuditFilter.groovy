package projecttracker

import constantes.EnunConversorMensages;

class AuditFilter {


	private static final String START_TIME_ATTRIBUTE = 'Controller__START_TIME__'
	private static final String REQUEST_NUMBER_ATTRIBUTE = 'Controller__REQUEST_NUMBER__'

	def filters = {
		all(controller:'*', action:'*') {
			before = {
				String text="$request.servletPath "
				User user=session.user
				if (user!=null) {
					Auditing a= new Auditing()
					a.usuario=user.userName
					a.acao= EnunConversorMensages.getMensagem(text)
					a.data=new Date()
					a.save(flush: true)
				}
			}
			after = { Map model ->
				
			}
		}
	}
}