/*package br.com.ryanurtiga.servicex.pagamento.domain;
@Getter
@Setter
@Entity
@NoArgsConstructor
@JsonTypeName("pagamentoBoleto")
public class PagamentoBoleto {
@Column(name = "DATA_VENCIMENTO")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataVencimento;
    @Column(name = "DATA_PAGAMENTO")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataPagamento;


    public PagamentoBoleto(Integer idPagamento, StatusPagamento statusPagamento, OrdemServico ordemServico, Date dataVencimento, Date dataPagamento) {
        super(idPagamento, statusPagamento, ordemServico);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public PagamentoBoleto(Date dataVencimento, Date dataPagamento) {
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }
}
*/