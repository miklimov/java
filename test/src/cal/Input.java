package cal;

/**
*Интерфейс ввода
*/

public interface Input{
	/**
	*Считывание данных  с клавиатуры
	*/
	String next();
	/**
	*Вывод текста на ввод данных
	*/
	String ask(String question);
	/**
	*Закрытие считывания с клавиатуры
	*/
	void close();
	
}