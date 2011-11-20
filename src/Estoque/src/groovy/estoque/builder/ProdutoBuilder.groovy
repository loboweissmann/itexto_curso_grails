package estoque.builder
import estoque.*
public class ProdutoBuilder extends groovy.util.BuilderSupport {
	
	protected void setParent(Object parent, Object child) {
		
		if (parent instanceof Produto) {
			if (child instanceof Fornecedor)
				parent.fornecedor = child
			if (child instanceof Categoria)
				parent.categoria = child
		}
	}
	
	protected Object createNode(Object name) {
		
		switch (name) {
			case "categoria": 
				return new Categoria()
			case "fornecedor":
				return new Fornecedor()
			case "produto":
				return new Produto()
		}
		return null
	}
	
	protected Object createNode(Object name, Object value) {
		
		def node = createNode(name)
		if (node) {
			value(node) // executo a clojure
		}
		node
	}
	
	protected Object createNode(Object name, Map attributes) {
		
		def node = createNode(name)
		
		attributes.each {key, val ->
			node.metaClass.setProperty(node,key,val)	
		}
		node
	}
	
	protected Object createNode(Object name, Map attributes, Object value) {
		
		def node = createNode(name, attributes)
		if (node) value(node)
		node
	}
	
}
