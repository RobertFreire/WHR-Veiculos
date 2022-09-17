import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import cadastroClienteFisico from '../views/clientes/cadastroClienteFisico.vue'
import cadastroCliente from '../views/clientes/cadastroCliente.vue'
import cadastroClienteJuridico from '../views/clientes/cadastroClienteJuridico.vue'
import cadastroFuncionario from '../views/funcionarios/cadastroFuncionario.vue'
import cadastroVeiculoNovo from '../views/veiculos/veiculoNovo/cadastroVeiculoNovo.vue'
import cadastroVeiculoUsado from '../views/veiculos/veiculoUsado/cadastroVeiculoUsado.vue'
import cadastroModelo from '../views/veiculos/modelo/cadastroModelo.vue'
import findCpfCliente from '../views/clientes/findCliente.vue'
import CadastrarVeiculo from '../views/veiculos/CadastrarVeiculo.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/cadastroCliente',
    name: 'cadastroCliente',
    component: cadastroClienteFisico
  },
  {
    path: '/cadastroInicio',
    name: 'cadastroInicio',
    component: cadastroCliente
  },
  {
    path: '/cadastroClienteJuridico',
    name: 'cadastroClienteJuridico',
    component: cadastroClienteJuridico
  },
  {
    path: '/cadastroFuncionario',
    name: 'cadastroFuncionario',
    component: cadastroFuncionario
  },
  {
    path: '/cadastrarVeiculo',
    name: 'CadastrarVeiculo',
    component: CadastrarVeiculo
  },
   {
    path: '/cadastrarVeiculo/usado/:modelo',
    name: 'cadastrarVeiculoUsado',
    component: cadastroVeiculoUsado
  },
  {
    path: '/cadastrarVeiculo/novo/:modelo',
    name: 'cadastroVeiculoNovo',
    component: cadastroVeiculoNovo
  },
  {
    path: '/cadastroModelo',
    name: 'cadastroModelo',
    component: cadastroModelo
  },
  {
    path: '/findCpfCliente',
    name: 'findCpfCliente',
    component: findCpfCliente
  },
  {
    path: '/clientes',
    name: 'clientes',
    component: () => import(/* webpackChunkName: "about" */ '../views/clientes/allClientes.vue')
  },
  {
    path: '/funcionarios',
    name: 'funcionarios',
    component: () => import(/* webpackChunkName: "about" */ '../views/funcionarios/allFuncionarios.vue')
  },
  {
    path: '/veiculosNovos',
    name: 'veiculosNovos',
    component: () => import(/* webpackChunkName: "about" */ '../views/veiculos/veiculoNovo/allVeiculoNovo')
  },
  {
    path: '/veiculosUsados',
    name: 'veiculosUsados',
    component: () => import(/* webpackChunkName: "about" */ '../views/veiculos/veiculoUsado/allVeiculoUsado.vue')
  },
  {
    path: '/modelos',
    name: 'modelos',
    component: () => import(/* webpackChunkName: "about" */ '../views/veiculos/modelo/allModelo.vue')
  },
  {
    path: '/cpfCliente',
    name: 'cpfCliente',
    component: () => import(/* webpackChunkName: "about" */ '../views/clientes/findCliente.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router