package tk.koalazone.a1palavra1msica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class jogo extends AppCompatActivity {

    private Button next;
    private TextView word;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogo);

        next = (Button) findViewById(R.id.button);
        word = (TextView) findViewById(R.id.textView2);

        String[] palavras = {"ano", "dia", "vez", "coisa", "tempo", "homem", "casa", "vida", "pessoa", "país", "forma", " parte", " estado", " governo", " caso", " trabalho", "presidente", " mulher", " gente", " cidade", " mundo"," mão", " público", " hora", " lado", " olho", " grupo", " obra", " senhor", " terra", " nome", " filho", " relação", " real", " noite", " pai", " problema", " empresa", " direito", " água", " processo", " sistema", " região", " ponto", " fim", " palavra", " mês", " história", " número", " fato", " século", " área", " milhão", " corpo", " projecto", " força", " momento", " guerra", " tipo", " lugar", " família", " cabeça", " ideia", " valor", " livro", " rua", " serviço", " tarde", " acção", " lei", " mãe", " final", " movimento", " rio", " partido", " local", " porta", " deus", " espécie", " situação", " frente", " câmara", " mercado", " acordo", " branco"," período", " morte", " semana", " campo", " questão", " fundo", " conta", " voz", " informação", " santo", " estudo", " verdade", " escola", " criança", " programa", " modo", " arte", " centro", " jogo", "volta", "dinheiro", "actividade", "ministro", "sul", "professor", "Utilizado", " luz", " medida", " pé", " banco", " condição", " termo", " sociedade", " senhora", " preço", " ordem", " equipa", " papel", " produção", " nível", " ar", " plano", " música", " causa", " desenvolvimento", " produto", " povo", " imagem", " texto", " população", " doutor", " animal", " objectivo", " base", " altura", " resultado", " capital", " época", " norte", " costa"," razão", " filme", " cima", " passo", " jornal", " função", " linha", " início", " sentido", " maneira", " conto", " carro", " caminho", " autor", " espaço", " braço", " efeito", " saúde", " amor", " estructura", " direcção", " futuro", " figura", " posição", " conjunto", " igreja"," deputado", " comissão", " guarda", " técnico", " interesse", " maioria", " quarto", " decisão", " sol", " república", " recurso", " sala", " construção", " universidade", " filha", " falta", " título", " língua", " elemento", " eleição", " cultura", " inglés", " setor", " líder", " polícia", " origem", " modelo", " rei", " teatro", " zona", " cara", " qualidade", " director", " apoio", " mar", " unido", " princípio", " material", " proposta", " mesa", " necessidade", " assunto", " rede", " cor", " reforma", " membro", " negócio", " manhã", " encontro", " vontade", " último", " fase"," conhecimento", " doença", " carta", " interior", " organização", " segurança", " candidato", " conselho", " ilha", " ministério", " contrário", " união", " indústria", " formação", " televisão", " associação", " economia", " idade", " padre", " boca", " espírito", " presença", " alma", "peça", " venda", " uso", " pena", " justiça", " média", " criação", " pesquisa", " característica", " resposta", " fonte", " clube", " energia", " médico"," aumento", " unidade", " silêncio", " realidade", " natureza", " ciência", " companhia", " coração", " análise", " objecto", " curso", " experiência", " operação", " pedra", " medo", " viagem", " método", " série", " preso", " dado", " cinema", " estrangeiro", " possibilidade", " defesa", " militar", " sangue", " respeito", " vitória", " administração", " aspecto", " ambiente", " rapaz", " árvore", " minuto", " prova", " importância", " quilómetro", " dúvida", " regra", " rosto", " estrada", " tribunal", " irmão", " largo", " reunião", " taxa", " prazo", " município", " dificuldade", " cargo", " trabalhador", " mudança", " jogador", " chefe", " classe","a artista", "trigo", "planta", "resto", "educação", "ssembleia", "marido", "entrada", "pinião", "tema", "sinal", "instituição", "teoria", "capacidade", "pensamento", "prática", "face", "frio", "comércio", "janela", "território", "campanha", "luta", "existência", "menino", "solução", "tenção", "metro", "quadro", "investimento", "década", "vila", "diferença", "gênero", "prémio", "graça", "paz", "indivíduo", "expressão", "festa", "poeta", "custo", "exército", "crime", "índio", "dona", "comunicação", "parede", "amigo", "vale", "voto", "próprio", "influência", "céu", "chão", "congresso", "meio", "futebol", "motivo", "erro", "cabo", "carreira", "risco", "governador", "madeira", "secretário", "massa", "crescimento", "factor", "cama", "sucesso", "literatura", "escritor", "estilo", "único", "órgão", "autoridade", "estrela", "documento", "comunidade", "conversa", "perna", "participação", "arma", "menina", "instituto", "cabelo", "café", "certeza", "visita", "dor", "sonho", "data", "esforço", "fazenda", "exposição", "matéria", "máquina", "contacto", "instrumento", "liberdade", "superfície", "quantidade", "som", "passagem", "sentença", "lista", "crise", "preto", "sombra", "contracto", "ouro", "vento", "memória", "regime", "posição", "dedo", "investigação", "notícia", "hospital", "discurso", "outubro", "roupa", "pressão", "onda", "funcionário", "aluno", "constituição", "terreno", "volume", "conceito", "ataque", "tratamento", "célula", "distância", "peso", "carne", "ensino", "pintura", "banda", "carácter", "museu", "velocidade", "acesso", "emprego", "desejo", "ligado", "pergunta", "fogo", "gesto", "domínio", "peixe", "tamanho", "batalha", "temperatura", "romance", "favor", "espera", "intenção", "sede", "ferro", "representante", "representação", "aplicação", "irmã", "bilhão", "cavalo", "jardim", "ramo", "letra", "canto", "responsabilidade", "revolução", "margem", "par", "destino", "revista", "folha", "mestre", "distrito", "pagamento", "companheiro", "iniciativa", "tom", "caixa", "pequeno", "concelho", "comportamento", "juiz", "entidade", "propriedade", "acidente", "pele", "tentativa", "visão", "preocupação", "crédito", "rádio", "habitante", "imposto", "computador", "geração", "gestão", "avaliação", "sentimento", "moça", "vítima", "compra", "nota", "advogado", "chuva", "torno", "corte", "espectáculo", "esquerda", "nação", "praça", "oportunidade", "tecnologia", "filosofia", "atitude", "política", "linguagem", "monte", "estação", "dívida", "gás", "disco", "loja", "tendência", "imprensa", "reino", "seguro", "alteração", "instante", "príncipe", "cadeira", "exterior", "empresário", "consciência", "hipótese", "limite", "redução", "personagem", "jornalista", "grau", "cena", "tradição", "soldado", "automóvel", "moeda", "juro", "primeiro-ministro", "peito", "consequência", "salário", "estudante", "reacção", "divisão", "elevado", "conflito", "porto","abertura", "utilização", "cão", "realização", "ligação", "transporte", "dólar", "ombro", "casamento", "clássico", "ldeia", "saída", "ator", "esperança", "executivo", "queda", "campeonato", "vestido", "metade", "secção", "poesia", "intervenção", "parque", "ponta", "tropa", "gente", "discussão", "violência", "senador", "padrão", "calor", "referência", "missão", "impressão", "carga", "núcleo", "busca", "ato", "complexo", "cidadão", "tarefa", "controle", "coronel", "marca", "edifício", "agência", "grego", "rapariga", "praia", "frase", "partida", "solo", "jeito", "cruz", "palácio", "perda", "presidência", "negociação", "general", "produtor", "vantagem", "estratégia", "bolsa", "organismo", "dente", "página", "mina", "ponte", "comprimento", "veículo", "teste", "bem", "gosto", "vizinho", "pertencente", "prazer", "sujeito", "juda", "bola", "grosso", "procura", "edição", "equipamento", "consumidor", "vinho", "relatório","dono", "declaração", "alimento", "fenómeno", "flor", "alegria", "categoria", "distribuição", "império", "entrevista", "renda", "chamada", "cliente", "torre", "versão", "telefone", "escolha", "cadeia", "breve", "feira", "fronteira", "manifestação", "perspectiva", "sorriso", "exemplo", "receita", "património", "privado", "consumo", "agricultura", "resistência", "secretaria", "floresta", "hotel", "substância", "conclusão", "componente", "candidatura", "grito", "selecção", "roda", "prisão", "ocasião", "tabela", "fábrica", "sequência", "evolução", "freguesia", "composto","canal", "dirigente", "sorte", "leite", "comando", "composição", "perigo", "exercício", "leitor", "aprovado", "variação","orçamento", "beleza", "concepção", "instalação", "avião", "pintor", "mandato", "leitura", "combate", "pão", "ave", "protecção", "time", "raio", "critério", "aliado", "fruto", "diário", "opção", "sessão", "castelo", "droga", "colega", "frequência", "crítica", "reportagem", "poder", "tio", "contexto", "propósito", "sítio", "fundação", "autarquia", "senado", "reserva", "navio","lucro", "lágrima", "camada", "capítulo", "disposição", "independência", "paixão", "verão", "fio", "dimensão", "acontecimento", "ausência", "sindicato", "clima", "símbolo", "parlamento", "confiança", "etapa", "alternativa", "nomeado", "troca", "bicho", "aula", "cuidado", "vazio", "chave", "desenho", "hábito", "corredor", "surpresa", "coluna", "prefeito","religião", "fome", "evento", "vidro", "prefeitura", "diabo", "conferência", "aparelho", "ritmo", "inflação", "debate", "faculdade", "garantia", "departamento", "bocado", "chapéu", "ciclo", "neto", "privatização", "rainha", "associado", "sensação", "cigarro", "posse", "raiz", "lançamento", "casal", "província", "adversário", "metal", "argumento", "certo", "apresentação", "exame", "explicação", "ativo", "expectativa", "tiro", "poema", "despesa", "resolução", "medicina", "junta", "inimigo", "corrida", "milhar", "lua", "denominado", "estabelecimento", "barro", "golpe", "índice", "lábio", "cenário", "impacto", "mensagem","carvalho", "motor", "pedaço", "conteúdo", "destaque", "financiamento", "leste", "concurso", "culpa", "retrato", "sexta-feira", "designação", "marquês", "tia", "norma", "inverno", "prédio", "observação", "faixa", "coragem", "madrugada","planeta", "obrigação", "código", "engenheiro", "vereador", "via", "excepção", "escada","oeste","tecido", "cheiro", "interpretação", "segredo", "publicação", "centímetro", "pescoço","definição", "honra", "funcionamento", "montanha", "revisão", "comandante", "copa", "turismo", "chegada", "baseado", "ovo", "asa", "âmbito", "democracia", "cozinha", "segunda-feira", "profissão", "votação", "feito", "cientista", "rocha", "barco", "paciente", "apto", "ameaça", "gabinete", "pedido", "dança", "petróleo", "novidade", " universo", "federação", "moda", "compromisso", "fé", "especialista", "costume", "mecanismo", "corda", "parágrafo", "continente", "bloco", "diálogo", "desafio", "academia", "tratado", "nordeste", "sexo", "escrita", "horizonte", "usuário", "sono", "saudade", "marcha", "álcool", "fórmula", "personalidade", "proprietário", "liderança", "aliança", "cálculo", "escala", "osso","raça", "féria", "bandeira", "estreito", "colégio", "gato", "nuvem", "procedimento", "riso", "extensão", "nascimento", "transformação", "corpus", "classificação", "cartão", "exploração", "partícula", "círculo", "avô", "expansão", "papa", "prejuízo", "passeio","canção", "patrão", "potencial", "horário", "derrota", "desempenho", "deserto", "emoção", "aprovação", "gado", "competição", "juventude", "orientação", "colecção", "almoço", "espelho", "circunstância", "sócio", "capitão", "protesto", "centena", "avenida", "exportação", "julgamento", "festival", "pau"};
        int f = (int) ((int)palavras.length*Math.random());
        word.setText(palavras[(int)f]);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] palavras = {"ano", "dia", "vez", "coisa", "tempo", "homem", "casa", "vida", "pessoa", "país", "forma", " parte", " estado", " governo", " caso", " trabalho", "presidente", " mulher", " gente", " cidade", " mundo"," mão", " público", " hora", " lado", " olho", " grupo", " obra", " senhor", " terra", " nome", " filho", " relação", " real", " noite", " pai", " problema", " empresa", " direito", " água", " processo", " sistema", " região", " ponto", " fim", " palavra", " mês", " história", " número", " fato", " século", " área", " milhão", " corpo", " projecto", " força", " momento", " guerra", " tipo", " lugar", " família", " cabeça", " ideia", " valor", " livro", " rua", " serviço", " tarde", " acção", " lei", " mãe", " final", " movimento", " rio", " partido", " local", " porta", " deus", " espécie", " situação", " frente", " câmara", " mercado", " acordo", " branco"," período", " morte", " semana", " campo", " questão", " fundo", " conta", " voz", " informação", " santo", " estudo", " verdade", " escola", " criança", " programa", " modo", " arte", " centro", " jogo", "volta", "dinheiro", "actividade", "ministro", "sul", "professor", "Utilizado", " luz", " medida", " pé", " banco", " condição", " termo", " sociedade", " senhora", " preço", " ordem", " equipa", " papel", " produção", " nível", " ar", " plano", " música", " causa", " desenvolvimento", " produto", " povo", " imagem", " texto", " população", " doutor", " animal", " objectivo", " base", " altura", " resultado", " capital", " época", " norte", " costa"," razão", " filme", " cima", " passo", " jornal", " função", " linha", " início", " sentido", " maneira", " conto", " carro", " caminho", " autor", " espaço", " braço", " efeito", " saúde", " amor", " estructura", " direcção", " futuro", " figura", " posição", " conjunto", " igreja"," deputado", " comissão", " guarda", " técnico", " interesse", " maioria", " quarto", " decisão", " sol", " república", " recurso", " sala", " construção", " universidade", " filha", " falta", " título", " língua", " elemento", " eleição", " cultura", " inglés", " setor", " líder", " polícia", " origem", " modelo", " rei", " teatro", " zona", " cara", " qualidade", " director", " apoio", " mar", " unido", " princípio", " material", " proposta", " mesa", " necessidade", " assunto", " rede", " cor", " reforma", " membro", " negócio", " manhã", " encontro", " vontade", " último", " fase"," conhecimento", " doença", " carta", " interior", " organização", " segurança", " candidato", " conselho", " ilha", " ministério", " contrário", " união", " indústria", " formação", " televisão", " associação", " economia", " idade", " padre", " boca", " espírito", " presença", " alma", "peça", " venda", " uso", " pena", " justiça", " média", " criação", " pesquisa", " característica", " resposta", " fonte", " clube", " energia", " médico"," aumento", " unidade", " silêncio", " realidade", " natureza", " ciência", " companhia", " coração", " análise", " objecto", " curso", " experiência", " operação", " pedra", " medo", " viagem", " método", " série", " preso", " dado", " cinema", " estrangeiro", " possibilidade", " defesa", " militar", " sangue", " respeito", " vitória", " administração", " aspecto", " ambiente", " rapaz", " árvore", " minuto", " prova", " importância", " quilómetro", " dúvida", " regra", " rosto", " estrada", " tribunal", " irmão", " largo", " reunião", " taxa", " prazo", " município", " dificuldade", " cargo", " trabalhador", " mudança", " jogador", " chefe", " classe","a artista", "trigo", "planta", "resto", "educação", "ssembleia", "marido", "entrada", "pinião", "tema", "sinal", "instituição", "teoria", "capacidade", "pensamento", "prática", "face", "frio", "comércio", "janela", "território", "campanha", "luta", "existência", "menino", "solução", "tenção", "metro", "quadro", "investimento", "década", "vila", "diferença", "gênero", "prémio", "graça", "paz", "indivíduo", "expressão", "festa", "poeta", "custo", "exército", "crime", "índio", "dona", "comunicação", "parede", "amigo", "vale", "voto", "próprio", "influência", "céu", "chão", "congresso", "meio", "futebol", "motivo", "erro", "cabo", "carreira", "risco", "governador", "madeira", "secretário", "massa", "crescimento", "factor", "cama", "sucesso", "literatura", "escritor", "estilo", "único", "órgão", "autoridade", "estrela", "documento", "comunidade", "conversa", "perna", "participação", "arma", "menina", "instituto", "cabelo", "café", "certeza", "visita", "dor", "sonho", "data", "esforço", "fazenda", "exposição", "matéria", "máquina", "contacto", "instrumento", "liberdade", "superfície", "quantidade", "som", "passagem", "sentença", "lista", "crise", "preto", "sombra", "contracto", "ouro", "vento", "memória", "regime", "posição", "dedo", "investigação", "notícia", "hospital", "discurso", "outubro", "roupa", "pressão", "onda", "funcionário", "aluno", "constituição", "terreno", "volume", "conceito", "ataque", "tratamento", "célula", "distância", "peso", "carne", "ensino", "pintura", "banda", "carácter", "museu", "velocidade", "acesso", "emprego", "desejo", "ligado", "pergunta", "fogo", "gesto", "domínio", "peixe", "tamanho", "batalha", "temperatura", "romance", "favor", "espera", "intenção", "sede", "ferro", "representante", "representação", "aplicação", "irmã", "bilhão", "cavalo", "jardim", "ramo", "letra", "canto", "responsabilidade", "revolução", "margem", "par", "destino", "revista", "folha", "mestre", "distrito", "pagamento", "companheiro", "iniciativa", "tom", "caixa", "pequeno", "concelho", "comportamento", "juiz", "entidade", "propriedade", "acidente", "pele", "tentativa", "visão", "preocupação", "crédito", "rádio", "habitante", "imposto", "computador", "geração", "gestão", "avaliação", "sentimento", "moça", "vítima", "compra", "nota", "advogado", "chuva", "torno", "corte", "espectáculo", "esquerda", "nação", "praça", "oportunidade", "tecnologia", "filosofia", "atitude", "política", "linguagem", "monte", "estação", "dívida", "gás", "disco", "loja", "tendência", "imprensa", "reino", "seguro", "alteração", "instante", "príncipe", "cadeira", "exterior", "empresário", "consciência", "hipótese", "limite", "redução", "personagem", "jornalista", "grau", "cena", "tradição", "soldado", "automóvel", "moeda", "juro", "primeiro-ministro", "peito", "consequência", "salário", "estudante", "reacção", "divisão", "elevado", "conflito", "porto","abertura", "utilização", "cão", "realização", "ligação", "transporte", "dólar", "ombro", "casamento", "clássico", "ldeia", "saída", "ator", "esperança", "executivo", "queda", "campeonato", "vestido", "metade", "secção", "poesia", "intervenção", "parque", "ponta", "tropa", "gente", "discussão", "violência", "senador", "padrão", "calor", "referência", "missão", "impressão", "carga", "núcleo", "busca", "ato", "complexo", "cidadão", "tarefa", "controle", "coronel", "marca", "edifício", "agência", "grego", "rapariga", "praia", "frase", "partida", "solo", "jeito", "cruz", "palácio", "perda", "presidência", "negociação", "general", "produtor", "vantagem", "estratégia", "bolsa", "organismo", "dente", "página", "mina", "ponte", "comprimento", "veículo", "teste", "bem", "gosto", "vizinho", "pertencente", "prazer", "sujeito", "juda", "bola", "grosso", "procura", "edição", "equipamento", "consumidor", "vinho", "relatório","dono", "declaração", "alimento", "fenómeno", "flor", "alegria", "categoria", "distribuição", "império", "entrevista", "renda", "chamada", "cliente", "torre", "versão", "telefone", "escolha", "cadeia", "breve", "feira", "fronteira", "manifestação", "perspectiva", "sorriso", "exemplo", "receita", "património", "privado", "consumo", "agricultura", "resistência", "secretaria", "floresta", "hotel", "substância", "conclusão", "componente", "candidatura", "grito", "selecção", "roda", "prisão", "ocasião", "tabela", "fábrica", "sequência", "evolução", "freguesia", "composto","canal", "dirigente", "sorte", "leite", "comando", "composição", "perigo", "exercício", "leitor", "aprovado", "variação","orçamento", "beleza", "concepção", "instalação", "avião", "pintor", "mandato", "leitura", "combate", "pão", "ave", "protecção", "time", "raio", "critério", "aliado", "fruto", "diário", "opção", "sessão", "castelo", "droga", "colega", "frequência", "crítica", "reportagem", "poder", "tio", "contexto", "propósito", "sítio", "fundação", "autarquia", "senado", "reserva", "navio","lucro", "lágrima", "camada", "capítulo", "disposição", "independência", "paixão", "verão", "fio", "dimensão", "acontecimento", "ausência", "sindicato", "clima", "símbolo", "parlamento", "confiança", "etapa", "alternativa", "nomeado", "troca", "bicho", "aula", "cuidado", "vazio", "chave", "desenho", "hábito", "corredor", "surpresa", "coluna", "prefeito","religião", "fome", "evento", "vidro", "prefeitura", "diabo", "conferência", "aparelho", "ritmo", "inflação", "debate", "faculdade", "garantia", "departamento", "bocado", "chapéu", "ciclo", "neto", "privatização", "rainha", "associado", "sensação", "cigarro", "posse", "raiz", "lançamento", "casal", "província", "adversário", "metal", "argumento", "certo", "apresentação", "exame", "explicação", "ativo", "expectativa", "tiro", "poema", "despesa", "resolução", "medicina", "junta", "inimigo", "corrida", "milhar", "lua", "denominado", "estabelecimento", "barro", "golpe", "índice", "lábio", "cenário", "impacto", "mensagem","carvalho", "motor", "pedaço", "conteúdo", "destaque", "financiamento", "leste", "concurso", "culpa", "retrato", "sexta-feira", "designação", "marquês", "tia", "norma", "inverno", "prédio", "observação", "faixa", "coragem", "madrugada","planeta", "obrigação", "código", "engenheiro", "vereador", "via", "excepção", "escada","oeste","tecido", "cheiro", "interpretação", "segredo", "publicação", "centímetro", "pescoço","definição", "honra", "funcionamento", "montanha", "revisão", "comandante", "copa", "turismo", "chegada", "baseado", "ovo", "asa", "âmbito", "democracia", "cozinha", "segunda-feira", "profissão", "votação", "feito", "cientista", "rocha", "barco", "paciente", "apto", "ameaça", "gabinete", "pedido", "dança", "petróleo", "novidade", " universo", "federação", "moda", "compromisso", "fé", "especialista", "costume", "mecanismo", "corda", "parágrafo", "continente", "bloco", "diálogo", "desafio", "academia", "tratado", "nordeste", "sexo", "escrita", "horizonte", "usuário", "sono", "saudade", "marcha", "álcool", "fórmula", "personalidade", "proprietário", "liderança", "aliança", "cálculo", "escala", "osso","raça", "féria", "bandeira", "estreito", "colégio", "gato", "nuvem", "procedimento", "riso", "extensão", "nascimento", "transformação", "corpus", "classificação", "cartão", "exploração", "partícula", "círculo", "avô", "expansão", "papa", "prejuízo", "passeio","canção", "patrão", "potencial", "horário", "derrota", "desempenho", "deserto", "emoção", "aprovação", "gado", "competição", "juventude", "orientação", "colecção", "almoço", "espelho", "circunstância", "sócio", "capitão", "protesto", "centena", "avenida", "exportação", "julgamento", "festival", "pau"};
                int f = (int) ((int)palavras.length*Math.random());
                word.setText(palavras[(int)f]);
            }
        });

    }
}