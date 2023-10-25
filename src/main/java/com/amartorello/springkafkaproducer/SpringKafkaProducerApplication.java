package com.amartorello.springkafkaproducer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringKafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaProducerApplication.class, args);
	}

	@Bean
	CommandLineRunner sender(KafkaEventMessageSender sender) {

		return args -> {

			String messageISY = "{\"idEvent\":\"eb379c07-92f5-4b2d-ac9d-b8edd84db64f\",\"timestamp\":\"2023-10-19T10:08:35.806\",\"relations\":{\"CASSA_EFFETTI\":{\"products\":[],\"action\":\"REVOCA_AUTOMATICA\",\"addInfo\":{}},\"MY_KEY\":{\"products\":[{\"id\":\"34210308\",\"action\":\"REVOCA_AUTOMATICA\",\"addInfo\":{}}]},\"SALVADANAIO\":{\"products\":[{\"id\":\"00700110000032374\",\"action\":\"REVOCA_AUTOMATICA\",\"addInfo\":{}}]},\"MANDATI\":{\"products\":[],\"action\":\"REVOCA_AUTOMATICA\",\"addInfo\":{}}},\"processStateEvent\":\"10395\",\"processStateEventName\":\"REVOCA_SERVIZI\",\"functionalityType\":\"ESTINZIONE\",\"requestType\":\"POSTA_ALTRO\",\"requestChannel\":\"EXTRA\",\"codAbi\":\"03385\",\"recipientList\":[\"CASSA_EFFETTI\",\"MY_KEY\",\"SALVADANAIO\",\"MANDATI\"],\"practice\":{\"superPracticeId\":\"2000212347\",\"stateMachineId\":\"6530ff3b862d3f1aa38ca3d3\",\"practiceStatusCode\":\"00\",\"idCluster\":\"2\",\"customer\":{\"ndg\":\"5132550143000\"},\"extinction\":{\"codReason\":\"01\",\"requestDate\":\"2023-10-19T00:00:00.183\",\"bookingLimitDate\":\"2023-11-04\",\"limitDate\":\"2023-11-07\"},\"destinationAmount\":{\"codDestinationType\":\"04\"},\"account\":{\"abiCode\":\"01025\",\"branchCode\":\"00700\",\"categoryCode\":\"1000\",\"accountNumber\":\"00173652\",\"technicalForm\":\"CC1000S0\",\"iban\":\"IT74S0306901000100000173652\",\"accountStartDate\":\"2023-05-26T00:00:00\"}},\"zeroingAmount\":{},\"conditions\":{},\"fees\":{},\"stampDuty\":{},\"senderInfo\":{\"userId\":\"U0K0692\",\"branchCode\":\"71501\",\"companyIdCode\":\"01\"}}";
			String message = "{\"idEvent\":\"eb379c07-92f5-4b2d-ac9d-b8edd84db64f\",\"timestamp\":\"2023-10-19T10:08:35.806\",\"relations\":{\"CASSA_EFFETTI\":{\"products\":[],\"action\":\"REVOCA_AUTOMATICA\",\"addInfo\":{}},\"MY_KEY\":{\"products\":[{\"id\":\"34210308\",\"action\":\"REVOCA_AUTOMATICA\",\"addInfo\":{}}]},\"SALVADANAIO\":{\"products\":[{\"id\":\"00700110000032374\",\"action\":\"REVOCA_AUTOMATICA\",\"addInfo\":{}}]},\"MANDATI\":{\"products\":[],\"action\":\"REVOCA_AUTOMATICA\",\"addInfo\":{}}},\"processStateEvent\":\"10395\",\"processStateEventName\":\"REVOCA_SERVIZI\",\"functionalityType\":\"ESTINZIONE\",\"requestType\":\"POSTA_ALTRO\",\"requestChannel\":\"EXTRA\",\"codAbi\":\"010255\",\"recipientList\":[\"CASSA_EFFETTI\",\"MY_KEY\",\"SALVADANAIO\",\"MANDATI\"],\"practice\":{\"superPracticeId\":\"2000212347\",\"stateMachineId\":\"6530ff3b862d3f1aa38ca3d3\",\"practiceStatusCode\":\"00\",\"idCluster\":\"2\",\"customer\":{\"ndg\":\"5132550143000\"},\"extinction\":{\"codReason\":\"01\",\"requestDate\":\"2023-10-19T00:00:00.183\",\"bookingLimitDate\":\"2023-11-04\",\"limitDate\":\"2023-11-07\"},\"destinationAmount\":{\"codDestinationType\":\"04\"},\"account\":{\"abiCode\":\"01025\",\"branchCode\":\"00700\",\"categoryCode\":\"1000\",\"accountNumber\":\"00173652\",\"technicalForm\":\"CC1000S0\",\"iban\":\"IT74S0306901000100000173652\",\"accountStartDate\":\"2023-05-26T00:00:00\"}},\"zeroingAmount\":{},\"conditions\":{},\"fees\":{},\"stampDuty\":{},\"senderInfo\":{\"userId\":\"U0K0692\",\"branchCode\":\"71501\",\"companyIdCode\":\"01\"}}";

			sender.send(message);

		};
	}

}
