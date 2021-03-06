// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scalapb.learning.proto.person

@SerialVersionUID(0L)
final case class Person(
    name: _root_.scala.Predef.String = "",
    age: _root_.scala.Int = 0,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Person] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = age
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = name
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = age
        if (__v != 0) {
          _output__.writeInt32(2, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withName(__v: _root_.scala.Predef.String): Person = copy(name = __v)
    def withAge(__v: _root_.scala.Int): Person = copy(age = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = age
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PInt(age)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scalapb.learning.proto.person.Person
    // @@protoc_insertion_point(GeneratedMessage[scalapb.learning.proto.Person])
}

object Person extends scalapb.GeneratedMessageCompanion[scalapb.learning.proto.person.Person] with scalapb.HasBuilder[scalapb.learning.proto.person.Person] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.learning.proto.person.Person] with scalapb.HasBuilder[scalapb.learning.proto.person.Person] = this
  def merge(`_message__`: scalapb.learning.proto.person.Person, `_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.learning.proto.person.Person = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.learning.proto.person.Person] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.learning.proto.person.Person(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        age = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PersonProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PersonProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = scalapb.learning.proto.person.Person(
    name = "",
    age = 0
  )
  final class Builder private (
    private var __name: _root_.scala.Predef.String,
    private var __age: _root_.scala.Int,
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[scalapb.learning.proto.person.Person] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readStringRequireUtf8()
          case 16 =>
            __age = _input__.readInt32()
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): scalapb.learning.proto.person.Person = {
      scalapb.learning.proto.person.Person(
        name = __name,
        age = __age,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[scalapb.learning.proto.person.Person, scalapb.learning.proto.person.Person.Builder] {
    def apply(): Builder = new Builder(
      __name = "",
      __age = 0,
      `_unknownFields__` = null
    )
    def apply(`_message__`: scalapb.learning.proto.person.Person): Builder = new Builder(
        __name = _message__.name,
        __age = _message__.age,
        `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = scalapb.learning.proto.person.Person.Builder()
  def newBuilder(`_message__`: scalapb.learning.proto.person.Person): Builder = scalapb.learning.proto.person.Person.Builder(_message__)
  implicit class PersonLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.learning.proto.person.Person]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.learning.proto.person.Person](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def age: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.age)((c_, f_) => c_.copy(age = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val AGE_FIELD_NUMBER = 2
  def of(
    name: _root_.scala.Predef.String,
    age: _root_.scala.Int
  ): _root_.scalapb.learning.proto.person.Person = _root_.scalapb.learning.proto.person.Person(
    name,
    age
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[scalapb.learning.proto.Person])
}
