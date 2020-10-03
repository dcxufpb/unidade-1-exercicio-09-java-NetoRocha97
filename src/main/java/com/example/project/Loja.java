package com.example.project;

public class Loja {

    private String nomeLoja;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String municipio;
    private String estado;
    private String cep;
    private String telefone;
    private String observacao;
    private String cnpj;
    private String inscricaoEstadual;

    public Loja(String nomeLoja, String logradouro, int numero, String complemento, String bairro, String municipio,
            String estado, String cep, String telefone, String observacao, String cnpj, String inscricaoEstadual) {
        this.nomeLoja = nomeLoja;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.observacao = observacao;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNomeLoja() {
        return this.nomeLoja;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getMunicipio() {
        return this.municipio;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getCep() {
        return this.cep;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getObservacao() {
        return this.observacao;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public static boolean isEmpty(String input) {
        if(input == null) {
            return true;
        }
        if(input.equals("")) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String brk = System.lineSeparator();

    public String dadosLoja(Loja loja) {
        
        if(isEmpty(loja.getNomeLoja())) {
            throw new RuntimeException("O campo nome da loja é obrigatório");
        }

        if(isEmpty(loja.getLogradouro())) {
            throw new RuntimeException("O campo logradouro do endereço é obrigatório");
        }

        if(isEmpty(loja.getMunicipio())) {
            throw new RuntimeException("O campo município do endereço é obrigatório");
        }

        if(isEmpty(loja.getEstado())) {
            throw new RuntimeException("O campo estado do endereço é obrigatório");
        }

        if(isEmpty(loja.getCnpj())) {
            throw new RuntimeException("O campo cnpj da loja é obrigatório");
        }

        if(isEmpty(loja.getInscricaoEstadual())) {
            throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
        }

        String _logradouro = loja.getLogradouro() + ", ";
		String _numero = (loja.getNumero() <= 0)? "s/n" : String.format("%d", loja.getNumero());
		String _complemento = isEmpty(loja.getComplemento())? "" : " " + loja.getComplemento();
		String _bairro = isEmpty(loja.getBairro())? "" : loja.getBairro() + " - ";
		String _municipio = loja.getMunicipio() + " - ";
		
		String _cep = isEmpty(loja.getCep())? "" : "CEP:" + loja.getCep();
		String _telefone = isEmpty(loja.getTelefone())? "" : "Tel " + loja.getTelefone();
		_telefone = (!_telefone.isEmpty() && !_cep.isEmpty())? " " + _telefone : _telefone;
		
		String _observacao = isEmpty(loja.getObservacao())? "" : loja.getObservacao();
						
		String _cnpj = "CNPJ: " + loja.getCnpj();
		String _inscricao_estadual = "IE: " + loja.getInscricaoEstadual();

		String dados_cupom = loja.getNomeLoja() + brk;
		dados_cupom += _logradouro + _numero + _complemento  + brk;
		dados_cupom += _bairro + _municipio + loja.getEstado() + brk;
		dados_cupom += _cep + _telefone + brk;
		dados_cupom += _observacao + brk;
		dados_cupom += _cnpj + brk;
		dados_cupom += _inscricao_estadual + brk;

		return dados_cupom;
	}

}