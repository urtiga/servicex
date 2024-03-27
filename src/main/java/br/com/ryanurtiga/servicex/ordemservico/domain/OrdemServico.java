/*package br.com.ryanurtiga.servicex.ordemservico.domain;
@Data
@NoArgsConstructor
@Entity
@Table
public class OrdemServico {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOS;
    @Column(name = "DATA_SOLICITACAO")

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date dataSolicitacao;
    @Column (name = "VALORES_OS")
    private double valorOS;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "ordemservico")
    private Pagamento pagamento;
    @ManyToMany
    @JoinTable(name = "SERVICO_OS",
    joinColumns = @JoinColumn(name = "ID_OS"),
    inverseJoinColumns = @JoinColumn(name = "ID_SERVICO"))
    private Set<Servico> servicos;

}
*/