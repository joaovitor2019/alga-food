package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.modelo.Cliente;

public class NotificadorEmail implements Notificador {

    private Boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if (Boolean.TRUE.equals(this.caixaAlta)) {
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificando %s através do e-mail %s usando o SMTP %s: %s\n",
                cliente.getNome(), cliente.getEmail(), hostServidorSmtp, mensagem);
    }

    public void setCaixaAlta(Boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}
