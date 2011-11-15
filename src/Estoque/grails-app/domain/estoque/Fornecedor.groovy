package estoque

class Fornecedor {
	
	String nome
	String email
	String endereco
	
	String toString() {
		this.nome
	}
	
    static constraints = {
		nome(nullable:false, blank:false, unique:true, maxSize:64)
		endereco(nullable:false, blank:false, maxSize:255)
		email(nullable:false, blank:false, maxSize:128, unique:true, email:true)
    }
}
