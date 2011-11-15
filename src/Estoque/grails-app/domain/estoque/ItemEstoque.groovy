package estoque

class ItemEstoque {
	
	double quantidade = 0
	
	static belongsTo = [produto:Produto]
	
    static constraints = {
		quantidade(nullable:false)
		produto(nullable:false, unique:true)
    }
}
