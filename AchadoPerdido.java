package br.com.newton.Questao2ProvaFinal;

public class AchadoPerdido {
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String localAchado;
    private String dataHora;
    private String status;

    public void achadoPerdido(){
        Publicacao publi = new Publicacao() {
            @Override
            public boolean buscarTitulo(String titulo) {
                if(!titulo.equals("")){

                return false;
            }

            @Override
            public void vizualizarDetalhes() {
                    achadoPerdido();
                }

            }

            @Override
            public void vizualizarDetalhes() {

            }

        };


    }
    public void completaDados( String foto ,String localAchado,String dataHora){


        }


    }





