package cal;

/**
*��������� �����
*/

public interface Input{
	/**
	*���������� ������  � ����������
	*/
	String next();
	/**
	*����� ������ �� ���� ������
	*/
	String ask(String question);
	/**
	*�������� ���������� � ����������
	*/
	void close();
	
}