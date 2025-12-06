package cse213.cement_factory.main;

import cse213.cement_factory.Irtesham_2420891.Finance_Officer.DealerPaymentDummy;
import cse213.cement_factory.Irtesham_2420891.Finance_Officer.Finance_Officer;
import cse213.cement_factory.Irtesham_2420891.Plant_Manager.Plant_Manager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class CreateDummyDATA {


    public CreateDummyDATA() throws IOException {
        FileOutputStream fos = new FileOutputStream("Plant_Manager.bin");
        ObjectOutputStream obs = new ObjectOutputStream(fos);

        Plant_Manager PLM1 = new Plant_Manager(101, "Plant Manger", "101");
        obs.writeObject(PLM1);

        obs.close();
        fos.close();
        FileOutputStream f = new FileOutputStream("FinanceOfficer.bin");
        ObjectOutputStream o = new ObjectOutputStream(f);

        Finance_Officer FO1 = new Finance_Officer(101, "Finance Officer", "101");
        o.writeObject(FO1);

        o.close();
        f.close();

        FileOutputStream  DPfos= new FileOutputStream("DealerPayment.bin");
        ObjectOutputStream DPobs = new ObjectOutputStream(DPfos);
        DealerPaymentDummy DPD = new DealerPaymentDummy("Hossain", 100000.0, 200000.0, false, LocalDate.now());
        DealerPaymentDummy DPD2 = new DealerPaymentDummy("Irte", 200000.0, 400000.0, false, LocalDate.now());
        DealerPaymentDummy DPD3 = new DealerPaymentDummy("Hossain", 0.0, 500000.0, true, LocalDate.now());
        DealerPaymentDummy DPD4 = new DealerPaymentDummy("Irte", 0.0, 600000.0, true, LocalDate.now());
        DPobs.writeObject(DPD);
        DPobs.writeObject(DPD2);
        DPobs.writeObject(DPD3);
        DPobs.writeObject(DPD4);

        DPobs.close();


    }



}
