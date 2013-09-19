package projecttracker

import org.bouncycastle.asn1.x509.UserNotice;

class User {
	String userName
	String password	
	static belongsTo = [pessoaFisica: PessoaFisica]
    static constraints = {
		userName()
		password(password:true)
    }
}
