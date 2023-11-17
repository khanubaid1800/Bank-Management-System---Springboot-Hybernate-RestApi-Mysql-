package com.hub_bugs.BankManagementSystem.Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Accounts {
        @Id
        private Long accno;
        private String accholdername;
        private String acctype;
        private String bankname;
        private Long accbalance;
		public Long getAccno() {
			return accno;
		}
		public void setAccno(Long accno) {
			this.accno = accno;
		}
		public String getAccholdername() {
			return accholdername;
		}
		public void setAccholdername(String accholdername) {
			this.accholdername = accholdername;
		}
		public String getAcctype() {
			return acctype;
		}
		public void setAcctype(String acctype) {
			this.acctype = acctype;
		}
		public String getBankname() {
			return bankname;
		}
		public void setBankname(String bankname) {
			this.bankname = bankname;
		}
		public Long getAccbalance() {
			return accbalance;
		}
		public void setAccbalance(Long accbalance) {
			this.accbalance = accbalance;
		}
        
        
}