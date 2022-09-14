import http from "@/common/http";

class CadastroOrdemVendaPessoaFisicaService{
    getAll() {
        return http.get('/allOrdemPessoaFisica');
    }
    create(data) {
        return http.post("/ordemPessoaFisica", data);
    }
    deleteById(data) {
        return http.delete("/deleteOrdemPessoaFisica", data);
    }
    findByPagoOrdemFisica(data) {
        return http.get("/idOrdemPessoaFisica", data);
    }
    findByPagoOrdemFisica(data) {
        return http.get("/pagoOrdemPessoaFisica", data);
    }
}
export default new CadastroOrdemVendaPessoaFisicaService();