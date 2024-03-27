/*package br.com.ryanurtiga.servicex.ordemservico.resource;
@RestController
@RequestMapping(value = "/ordemservicos")
public class OrdemServicoResource {
@Autowired
    private OrdemServico ordemServicoService;

    @PostMapping
    public ResponseEntity<OrdemServico> criarOS(@ResponseBody OrdemServico ordemServico){
        ordemServico.criarOS(ordemServico);

    }

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(ordemServicoService.getIdOrdemServico())
}
*/