package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import play.data.validation.Required;
import play.data.validation.Unique;
import play.data.validation.Email;
import play.data.validation.MinSize;
import play.data.validation.MaxSize;
import play.data.validation.Min;
import play.data.validation.Max;
import play.db.jpa.Model;


@Entity
public class Usuario extends Model {

	@Required
	@MinSize(5)
	public String nome;

	@Required
	@Email
	@Unique
	public String email;

	@Required
	@MinSize(8)
	public String senha;

	@Required
	@MaxSize(4)
	@MinSize(4)
	public int Nascimento;
}
