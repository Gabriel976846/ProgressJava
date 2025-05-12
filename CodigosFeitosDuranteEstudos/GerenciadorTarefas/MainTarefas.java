package CodigosFeitosDuranteEstudos.GerenciadorTarefas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MainTarefas {
    public static void main(String[] args) {
        Scanner caixadeentrada = new Scanner(System.in);
        ListaGenericaTarefas<TarefasCaracteristicas> listatarefas = new ListaGenericaTarefas<>();
        List<String> camposdepreenchimento = Arrays.asList("Titulo", "Descrição", "Validade", "Prioridade", "Conclusao");
        List<String> valorestemporarios = new ArrayList<>(camposdepreenchimento.size());

        while (true) {
            System.out.println("======= Gerenciador de Tarefas =======");
            System.out.println("1 - Adicionar Tarefas");
            System.out.println("2 - Remover Tarefas");
            System.out.println("3 - Visualizar Tarefas");
            System.out.println("4 - Editar Tarefas");
            System.out.println("5 - Sair do Programa ");
            System.out.print("Digite a sua escolha: ");
            int escolha = caixadeentrada.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Adicione o Campo Corretamente. \nOu clique enter para deixar vazio");
                    System.out.println("=============================");
                    for (String campo : camposdepreenchimento) {
                        switch (campo) {
                            case "Titulo":
                                caixadeentrada.nextLine();
                                System.out.println("Adicione o Titulo");
                                System.out.print("Titulo: ");
                                String titulo = caixadeentrada.nextLine().trim();

                                if (titulo.isEmpty()) {
                                    System.out.println("O titulo é Obrigatorio");
                                    while (titulo.isEmpty()) {
                                        System.out.print("Titulo: ");
                                        titulo = caixadeentrada.nextLine().trim();

                                        if (!titulo.isEmpty()) {
                                            valorestemporarios.add(titulo.replaceAll("\\s+", "").trim().toUpperCase());
                                        }
                                    }
                                } else {
                                    valorestemporarios
                                            .add(titulo.replaceAll("\\s+", "").trim().toUpperCase());
                                }
                                break;
                            case "Descrição":
                                System.out.println("Descreva o Objetivo da Tarefa");
                                System.out.print("Descrição: ");
                                String descricao = caixadeentrada.nextLine();

                                if (descricao.isEmpty()) {
                                    System.out.println("A descrição é Obrigatoria");

                                    while (descricao.isEmpty()) {
                                        System.out.print("Descrição: ");
                                        descricao = caixadeentrada.nextLine().trim();

                                        if (!descricao.isEmpty()) {
                                            valorestemporarios.add(descricao.trim());
                                        }
                                    }
                                } else {
                                    valorestemporarios.add(descricao.trim());
                                }
                                break;
                            case "Validade":
                                System.out.println("Adicione a data da Tarefa \nApenas Numeros");
                                System.out.print("Data: ");
                                String data = caixadeentrada.nextLine().trim().replaceAll("\\s+", "");

                                if (data.isEmpty()) {
                                    valorestemporarios.add(null);
                                } else {
                                    valorestemporarios.add(data);
                                }

                                break;
                            case "Prioridade":
                                System.out.println("Selecione a Prioridade da Tarefa");
                                System.out.println("Prioridade \n1 - Alta \n2 - Media \n3 - Baixa");
                                System.out.print("Escolha: ");
                                String campoprioridade = caixadeentrada.nextLine().trim().replaceAll("\\s+", "");

                                if (campoprioridade.isEmpty()) {
                                    System.out.println("Digite um valor valido");
                                    while (true) {
                                        System.out.print("Escolha: ");
                                        campoprioridade = caixadeentrada.nextLine().trim().replaceAll("\\s+", "");
                                        if (campoprioridade.equals("1")) {
                                            valorestemporarios.add("ALTA");
                                            break;
                                        } else if (campoprioridade.equals("2")) {
                                            valorestemporarios.add("MEDIA");
                                            break;
                                        } else if (campoprioridade.equals("3")) {
                                            valorestemporarios.add("BAIXA");
                                            break;
                                        } else {
                                            System.out.println("Digite um valor valido");
                                        }
                                    }
                                } else {
                                    if (campoprioridade.equals("1")) {
                                        valorestemporarios.add("ALTA");
                                        break;
                                    } else if (campoprioridade.equals("2")) {
                                        valorestemporarios.add("MEDIA");
                                        break;
                                    } else {
                                        valorestemporarios.add("BAIXA");
                                        break;
                                    }
                                }
                                break;
                            case "Conclusao":
                                System.out.println("Selecione a situação da tarefa");
                                System.out.println("Conclusão \n1 - Conluida \n2 - Em Andamento \n3 - Pendente");
                                System.out.print("Escolha: ");
                                String statusconclusao = caixadeentrada.nextLine().trim().replaceAll("\\s+", "");

                                if (statusconclusao.isEmpty()) {
                                    valorestemporarios.add(null);
                                } else {
                                    int valorconclusao = Integer.parseInt(statusconclusao);
                                    switch (valorconclusao) {
                                        case 1:
                                            valorestemporarios.add("Concluida");
                                            break;
                                        case 2:
                                            valorestemporarios.add("Andamento");
                                            break;
                                        case 3:
                                            valorestemporarios.add("Pedente");
                                            break;
                                    }
                                }
                                break;
                        }

                    }
                    String valorconversao = valorestemporarios.get(2);
                    DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("ddMMyyyy");
                    LocalDate dataaserinseridonalista = LocalDate.parse(valorconversao, formatacao);
                    listatarefas.add(new TarefasCaracteristicas(valorestemporarios.getFirst(), valorestemporarios.get(1), dataaserinseridonalista, valorestemporarios.get(3), valorestemporarios.get(4)) {
                    });
                    break;
                case 2:
                    break;
            }
            System.out.println(listatarefas);

            if (escolha == 5) {
                System.out.println("Encerrando o Programa");
                caixadeentrada.close();
                break;
            }
        }
    }
}

