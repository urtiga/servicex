/*package br.com.ryanurtiga.servicex.pagamento.domain;
@Getter
@AllArgsConstructor
public enum StatusPagamento {
PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(2, "Cancelado");

    private int cod;
    private String descricao;

    public static  StatusPagamento toEnum(Integer cod) {
        for (StatusPagamento pagamento : StatusPagamento.values()) {
            if(cod.equals((pagamento.cod))){
                return pagamento;
            }
        }
        throw new IllegalArgumentException("Código Inválido"+cod);
    }
}
*/