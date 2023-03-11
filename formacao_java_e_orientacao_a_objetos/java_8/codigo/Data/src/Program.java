import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasParis = LocalDate.of(2024, 7, 26);
		System.out.println(olimpiadasParis);
		
		int anos = olimpiadasParis.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo =Period.between(hoje, olimpiadasParis);
		System.out.println(periodo);
		System.out.println("anos: " + periodo.getYears());
		System.out.println("meses: " + periodo.getMonths());
		System.out.println("dias: " + periodo.getDays());
		
		System.out.println(hoje.plusYears(1));
		System.out.println(hoje.plusMonths(1));
		System.out.println(hoje.plusDays(1));
		System.out.println(hoje.minusYears(1));
		System.out.println(hoje.minusMonths(1));
		System.out.println(hoje.minusDays(1));
		
		olimpiadasParis.plusYears(1);
		System.out.println(olimpiadasParis.getYear());
		LocalDate novaDataOlimpiada = olimpiadasParis.plusYears(1);
		System.out.println(novaDataOlimpiada.getYear());
		
		DateTimeFormatter dtfNormal = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(dtfNormal));
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		DateTimeFormatter dtfCompleto = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(agora.format(dtfCompleto));
		
	}
}
