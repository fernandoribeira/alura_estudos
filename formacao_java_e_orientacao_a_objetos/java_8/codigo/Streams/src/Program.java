import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScriot", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		// cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		// cursos.sort(Comparator.comparing(Curso::getAlunos));
		//cursos.forEach(c -> System.out.println(c.getAlunos()));

		cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.map(Curso::getAlunos)
			.forEach(System.out::println);
		System.out.println();
		
		int sum = cursos.stream()
			.filter(c -> c.getAlunos() > 100)
			.mapToInt(Curso::getAlunos)
			.sum();
		System.out.println(sum);

	}
}

class Curso {

	private String nome;
	private Integer alunos;

	public Curso(String nome, Integer alunos) {
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