package neej;

public class ConvertArrayByteToInt
{
	public static int[] byteArrayToUIntArray(byte[] byteArray)
	{
		int[] intArray = new int[byteArray.length];

		// Convert each byte to an int unsigned
		for (int i = 0; i < byteArray.length; i++) {
			intArray[i] = byteArray[i] & 0xFF;
		}

		return intArray;
	}
}
