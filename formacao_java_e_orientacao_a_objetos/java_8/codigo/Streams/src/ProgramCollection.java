import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProgramCollection {
	public static void main(String[] args) {

		List<CursoNovo> cursos = new ArrayList<>();
		cursos.add(new CursoNovo("Python", 45));
		cursos.add(new CursoNovo("JavaScript", 150));
		cursos.add(new CursoNovo("Java 8", 113));
		cursos.add(new CursoNovo("C", 55));

		Optional<CursoNovo> optional = cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.findAny();
		
		CursoNovo cursoNovo = optional.get();
		//cursoNovo= optional.orElse(null);
		//cursoNovo = optional.orElseThrow();
		optional.ifPresent(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.findFirst()
			.ifPresent(c -> System.out.println(c.getNome()));
		
		 List<CursoNovo> lista = cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.collect(Collectors.toList());
		
		 Map<String, Integer> mapa = cursos 
				 .stream() 
				 .filter(c -> c.getAlunos() > 100) 
				 .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
	}
}

class CursoNovo {

	private String nome;
	private Integer alunos;

	public CursoNovo(String nome, Integer alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public Integer getAlunos() {
		return alunos;
	}

}