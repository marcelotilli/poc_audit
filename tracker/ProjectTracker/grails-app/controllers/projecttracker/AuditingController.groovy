package projecttracker

class AuditingController {

 
	def scaffold=true
	def beforeInterceptor = [action:this.&auth]
	def index() {
		redirect(action: "list")
	}
	def auth() {
		if(!session.user) {
			redirect(controller:"EndUser", action:"login")
			return false
		}
	}
}
