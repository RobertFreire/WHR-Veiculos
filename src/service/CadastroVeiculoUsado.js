class CadastroVeiculoUsadoNovoService {
    getAll() {
        return http.get('/allVeiculoUsado');
    }
    create(data) {
        return http.post("/VeiculoUsado", data);
    }
    delete(data) {
        return http.delete("/deleteVeiculoUsado", data);
    }
}

export default new CadastroVeiculoUsadoNovoService();