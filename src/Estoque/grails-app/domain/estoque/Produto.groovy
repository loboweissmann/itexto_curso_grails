package estoque

class Produto {
	
	String nome
	
	static belongsTo = [categoria:Categoria, fornecedor:Fornecedor]
	
    static constraints = {
		nome(nullable:false, blank:false, unique:true, maxSize:128)
		categoria(nullable:false)
		fornecedor(nullable:false)
    }
}
